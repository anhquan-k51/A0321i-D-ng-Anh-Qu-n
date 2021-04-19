
var person = new Object();

// Attach properties and methods to person object
person.firstName = "James";
person["lastName"] = "Bond";
person.age = 25;
person.getFullName = function () {
    return this.firstName + ' ' + this.lastName;
};

// access properties & methods
person.firstName; // James
person.lastName; // Bond
person.getFullName(); // James Bond
