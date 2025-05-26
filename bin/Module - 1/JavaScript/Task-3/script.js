const events = [
    { name: "Music Fest", date: "2025-06-10", seats: 10 },
    { name: "Tech Meetup", date: "2024-01-15", seats: 0 },
    { name: "Yoga Day", date: "2025-07-05", seats: 5 }
];

events.forEach(event => {
    const currentDate = new Date();
    const eventDate = new Date(event.date);

    if (eventDate > currentDate && event.seats > 0) {
        console.log(`Event: ${event.name} | Date: ${event.date} | Seats: ${event.seats}`);
    } else {
        console.log(`Skipping: ${event.name}`);
    }
});

// Try-Catch for registration logic
function register(event) {
    try {
        if (event.seats <= 0) {
            throw new Error("No seats available!");
        }
        event.seats--;
        console.log(`Registered for ${event.name}. Seats left: ${event.seats}`);
    } catch (error) {
        console.error(`Registration failed: ${error.message}`);
    }
}

register(events[0]);
register(events[1]);  // should trigger error
