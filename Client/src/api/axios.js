import axios from 'axios'

const instance = axios.create({
    baseURL: 'http://localhost:9090/api', // đổi thành API của bạn
    timeout: 5000,
    headers: {
        'Content-Type': 'application/json',
    }
})

// Optional: interceptor token, lỗi...
instance.interceptors.response.use(
    res => res,
    err => {
        console.error('API Error:', err)
        return Promise.reject(err)
    }
)

export default instance
