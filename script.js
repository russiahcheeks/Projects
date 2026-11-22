// Store student names in an array
const students = ["Ava", "Liam", "Noah", "Mia"];

// Store student scores in an object
const scores = {
    Ava: 92,
    Liam: 78,
    Noah: 65,
    Mia: 88
};

// Determine the letter grade from a numeric score
const letterGrade = (score) => {
    if (score >= 90) {
        return "A";
    } else if (score >= 80) {
        return "B";
    } else if (score >= 70) {
        return "C";
    } else {
        return "D or below";
    }
};

// Loop through the students and display grades
for (let i = 0; i < students.length; i++) {
    let name = students[i];
    let score = scores[name];
    let grade = letterGrade(score);

    console.log(name + ": " + score + " (" + grade + ")");
}