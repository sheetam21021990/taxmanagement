function deactivateElement(id){
	document.getElementById("task").value = "deactivate";
	document.getElementById("operationon").value = id;
	document.forms[0].submit();
}
function activateElement(id){
	document.getElementById("task").value = "activate";
	document.getElementById("operationon").value = id;
	document.forms[0].submit();
}
function addElement(){
	document.getElementById("task").value = "add";
	document.forms[0].submit();
}
function changeView(){
	document.forms[0].submit();
}