document.getElementById("submitForm").addEventListener("submit", function (e) {
    e.preventDefault();

    const username = e.target.elements.username.value;
    document.getElementById("status").textContent = "Sending...";

    setTimeout(() => {
        fetch("https://jsonplaceholder.typicode.com/posts", {
            method: "POST",
            body: JSON.stringify({ name: username }),
            headers: { "Content-type": "application/json; charset=UTF-8" }
        })
        .then(response => response.json())
        .then(data => {
            console.log("Response:", data);
            document.getElementById("status").textContent = "Registration submitted successfully!";
        })
        .catch(error => {
            console.error("Error:", error);
            document.getElementById("status").textContent = "Submission failed.";
        });
    }, 2000); // simulate delay
});
