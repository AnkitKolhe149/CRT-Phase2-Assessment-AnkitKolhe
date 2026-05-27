//import React, { useState, useEffect } from 'react';
//
//function UserList() {
//  const [users, setUsers] = useState([]);
//  const [loading, setLoading] = useState(true);
//
//  useEffect(() => {
//    fetch('/api/users')
//      .then(res => res.json())
//      .then(data => {
//        setUsers(data);
//        setLoading(false);
//      })
//      .catch(() => setLoading(false));
//  }, []); // ✅ dependency array added
//
//  if (loading) {
//    return <p>Loading...</p>;
//  }
//
//  return (
//    <ul>
//      {users.map(u => (
//        <li key={u.id}>{u.name}</li>
//      ))}
//    </ul>
//  );
//}
//
//export default UserList;
