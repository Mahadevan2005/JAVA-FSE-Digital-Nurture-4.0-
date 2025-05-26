// Function to add an event
function addEvent(events, name, category) {
    events.push({ name, category });
}

// Register user
function registerUser(eventName) {
    console.log(`User registered for ${eventName}`);
}

// Filter by category
function filterEventsByCategory(events, category) {
    return events.filter(e => e.category === category);
}

// Closure to track total registrations per category
function registrationCounter() {
    let count = 0;
    return function () {
        count++;
        return count;
    };
}

const musicCounter = registrationCounter();

const events = [];
addEvent(events, "Music Fest", "music");
addEvent(events, "Art Expo", "art");
console.log(events);

const filtered = filterEventsByCategory(events, "music");
console.log("Music Events:", filtered);

// Callback demo
filtered.forEach(event => registerUser(event.name));

// Use closure
console.log("Music Reg #", musicCounter());
console.log("Music Reg #", musicCounter());
