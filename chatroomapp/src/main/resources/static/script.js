
var stompClient = null;

function connect(){
	
	let socket = new SockJS("/server1");
	stompClient = Stomp.over(socket);
	console.log(socket);
	
	stompClient.connect({},function(frame){
		console.log("Connected : "+frame);
		
		$("#name-form").addClass('d-none');
		$("#chat-room").removeClass('d-none');
		
		
		//subscribe
		
		stompClient.subscribe("/topic/return-to",function(response){
			
			showMessage(JSON.parse(response.body))
		})
	})
}




function showMessage(message){
	$("#message-container-table").prepend(`<tr><td><b>${message.name} : </b>${message.contact}</td></tr>`)
}


function sendMessage(){
	
	let jsonOb = {
		name:localStorage.getItem("name"),
		contact:$("#message-value").val()
	}
	document.getElementById("message-value").value="";
	
	stompClient.send("/app/message",{},JSON.stringify(jsonOb));
	
}


var n =0;

$(document).ready((e)=>{
	
	
	$("#login").click(()=>{
		   
		n++;
		let name = $("#name-value").val();
		localStorage.setItem("name",name);
		$("#username").html(`Welcome , <b>${name}</b>`)
		connect();
		
	})
	
	
	
	$("#send-btn").click(()=>{
		
		sendMessage();
	})
	
	
	$("#logout-btn").click(()=>{
		localStorage.removeItem("name")
		if(stompClient!=null){
			stompClient.disconnect();
			$("#name-form").removeClass('d-none');
			$("#chat-room").addClass('d-none');
			n--;
			
		}
	})
	
	
})