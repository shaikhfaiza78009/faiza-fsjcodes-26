document.getElementById("form").onsubmit = function(e) {
    e.preventDefault();

    if (name.value == "" || email.value == "" || msg.value == "")
        result.innerHTML = "Please fill all fields.";
    else {
        result.innerHTML = "Message sent successfully!";
        this.reset();
    }
};