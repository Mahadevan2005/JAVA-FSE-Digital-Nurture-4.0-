const events = [
    { name: "Music Fest", category: "music" },
    { name: "Yoga Day", category: "wellness" }
];

// Add new event
events.push({ name: "Art Workshop", category: "art" });

// Filter music events
const musicEvents = events.filter(e => e.category === "music");
console.log("Music Events:", musicEvents);

// Format display using map
const displayCards = events.map(e => `Event: ${e.name.toUpperCase()} (${e.category})`);
console.log("Display Cards:", displayCards);
