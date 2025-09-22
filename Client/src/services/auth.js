// services/auth.js
import axios from "../api/axios";

export async function login(username, password) {
    const res = await axios.post("/auth/login", { username, password });
    localStorage.setItem("token", res.data.token);
}
