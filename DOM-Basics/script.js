const counter = document.querySelector("#counter");
const countBtn = document.querySelector("#countBtn");

const toggleBtn = document.querySelector("#toggleBtn");
const toggleText = document.querySelector("#toggleText");

const echoInput = document.querySelector("#echoInput");
const echoOutput = document.querySelector("#echoOutput");

const listInput = document.querySelector("#listInput");
const addBtn = document.querySelector("#addBtn");
const itemList = document.querySelector("#itemList");

// Click Counter
let count = 0;

countBtn.addEventListener("click", function () {
    count++;
    counter.textContent = count;
});

// Text Toggle
toggleBtn.addEventListener("click", function () {
    toggleText.classList.toggle("hidden");
});

// Live Input Echo
echoInput.addEventListener("input", function () {
    echoOutput.textContent = echoInput.value;
});

// Dynamic List
addBtn.addEventListener("click", function () {
    const newItem = document.createElement("li");
    newItem.textContent = listInput.value;

    itemList.appendChild(newItem);

    listInput.value = "";
});