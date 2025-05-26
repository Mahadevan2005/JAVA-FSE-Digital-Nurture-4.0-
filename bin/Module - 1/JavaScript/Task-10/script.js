const event = {
    name: "Community Meetup",
    date: "2025-06-20",
    location: "Hall A"
};

// Destructuring
const { name, date } = event;
console.log(`Name: ${name}, Date: ${date}`);

// Default parameters
function register(user = "Guest") {
    console.log(`${user} registered.`);
}
register("Mahadevan");
register();

// Spread operator
const oldList = ["Music", "Tech"];
const newList = [...oldList, "Yoga"];
console.log("Event Categories:", newList);
