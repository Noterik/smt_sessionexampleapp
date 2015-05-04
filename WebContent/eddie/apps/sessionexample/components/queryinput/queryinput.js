var Queryinput = function(){
	var self = this;
	this.element = jQuery("#queryinput");
		
	/*
	this.queryInputForm.on("submit", function(e){
		e.preventDefault();		
		eddie.putLou("", "queryChange(" + self.queryInputField.val() + ")");
		return false;
	});
	*/
};
Queryinput.prototype = Object.create(Component.prototype);