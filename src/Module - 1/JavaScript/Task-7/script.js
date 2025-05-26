const events = [
    { name: "Music Fest", category: "music" },
    { name: "Tech Meetup", category: "tech" }
];

const container = document.querySelector("#eventList");

events.forEach(event => {
    const card = document.createElement("div");
    card.textContent = `${event.name} - ${event.category}`;
    card.className = "event-card";
    container.appendChild(card);
});
