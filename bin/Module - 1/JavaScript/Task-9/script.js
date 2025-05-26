// Simulate fetch from mock API
const apiURL = "https://jsonplaceholder.typicode.com/posts";

// Using then/catch
fetch(apiURL)
    .then(response => response.json())
    .then(data => {
        document.getElementById("output").textContent = "Events fetched!";
        console.log("Data:", data.slice(0, 3));
    })
    .catch(error => {
        document.getElementById("output").textContent = "Error fetching events.";
        console.error("Error:", error);
    });

// Using async/await
async function fetchEvents() {
    try {
        document.getElementById("output").textContent = "Loading (async)...";
        const res = await fetch(apiURL);
        const events = await res.json();
        console.log("Async Events:", events.slice(0, 3));
    } catch (err) {
        console.error("Async Error:", err);
    }
}

setTimeout(fetchEvents, 2000);
