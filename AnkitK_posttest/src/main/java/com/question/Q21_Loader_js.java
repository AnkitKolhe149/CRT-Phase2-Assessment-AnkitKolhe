//async function loadUsers() {
//  try {
//    const response = await fetch("/api/users");
//
//    if (!response.ok) {
//      throw new Error("Failed to fetch users");
//    }
//
//    const users = await response.json();
//
//    // Clear any previous error
//    document.getElementById("error").textContent = "";
//
//    // Render user names into <ul id="user-list">
//    const list = document.getElementById("user-list");
//    list.innerHTML = ""; // clear old entries
//    users.forEach(user => {
//      const li = document.createElement("li");
//      li.textContent = user.name;
//      list.appendChild(li);
//    });
//
//  } catch (err) {
//    // Show error message
//    document.getElementById("error").textContent = err.message;
//  }
//}
