import { createApp } from 'vue'
import './style.css'
import App from './App.vue'

import Problems from './views/Problems.vue'

const routes = [
    { path: '/', component: Problems }
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

const app = createApp(App)
app.use(router)
app.mount('#app')
