import { createRouter, createWebHistory } from 'vue-router'
import ProblemSolver from '../views/problem-solver.vue'
import Problems from '../views/problems.vue'


const routes = [
    { path: '/solve-problem', name: 'ProblemSolver', component: ProblemSolver },
    { path: '/problems', name: 'Problems', component: Problems },
    // 404 Not found
    // { path: '/:pathMatch(.*)*', name: 'NotFound', component: () => import('@/views/NotFound.vue') }
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router
