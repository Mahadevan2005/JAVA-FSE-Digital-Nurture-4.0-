document.getElementById("registrationForm").addEventListener("submit", function (e) {
    e.preventDefault();

    const { name, email, event } = e.target.elements;

    if (!name.value || !email.value) {
        document.getElementById("error").textContent = "All fields are required!";
        return;
    }

    document.getElementById("error").textContent = "";
    console.log(`Name: ${name.value}, Email: ${email.value}, Event: ${event.value}`);
    alert("Form submitted successfully!");
});
