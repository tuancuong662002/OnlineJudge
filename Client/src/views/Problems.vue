<template>
    <div class="min-h-screen bg-gray-900 text-white">
        <!-- Header -->
        <header class="bg-gray-800 border-b border-gray-700">
            <div class="flex items-center justify-between px-4 py-3">
                <div class="flex items-center space-x-6">
                    <div class="flex items-center space-x-2">
                        <div class="w-8 h-8 bg-orange-500 rounded flex items-center justify-center">
                            <span class="text-white font-bold">LC</span>
                        </div>
                    </div>
                    <nav class="flex items-center space-x-6">
                        <a href="#" class="text-gray-300 hover:text-white">Explore</a>
                        <a href="#" class="text-white border-b-2 border-orange-500 pb-3">Problems</a>
                        <a href="#" class="text-gray-300 hover:text-white">Contest</a>
                        <a href="#" class="text-gray-300 hover:text-white">Discuss</a>
                        <div class="relative">
                            <button class="text-gray-300 hover:text-white flex items-center">
                                Interview
                                <svg class="w-4 h-4 ml-1" fill="currentColor" viewBox="0 0 20 20">
                                    <path fill-rule="evenodd"
                                        d="M5.293 7.293a1 1 0 011.414 0L10 10.586l3.293-3.293a1 1 0 111.414 1.414l-4 4a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414z"
                                        clip-rule="evenodd" />
                                </svg>
                            </button>
                        </div>
                        <div class="relative">
                            <button class="text-orange-500 hover:text-orange-400 flex items-center">
                                Store
                                <svg class="w-4 h-4 ml-1" fill="currentColor" viewBox="0 0 20 20">
                                    <path fill-rule="evenodd"
                                        d="M5.293 7.293a1 1 0 011.414 0L10 10.586l3.293-3.293a1 1 0 111.414 1.414l-4 4a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414z"
                                        clip-rule="evenodd" />
                                </svg>
                            </button>
                        </div>
                    </nav>
                </div>
                <div class="flex items-center space-x-4">
                    <button class="text-gray-300 hover:text-white">
                        <svg class="w-6 h-6" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="M15 17h5l-5 5-5-5h5v-12"></path>
                        </svg>
                    </button>
                    <div class="flex items-center space-x-1">
                        <svg class="w-5 h-5 text-gray-400" fill="currentColor" viewBox="0 0 20 20">
                            <path d="M9 12l2 2 4-4m6 2a9 9 0 11-18 0 9 9 0 0118 0z"></path>
                        </svg>
                        <span class="text-gray-300">0</span>
                    </div>
                    <div class="w-8 h-8 bg-gray-600 rounded-full"></div>
                    <span class="text-orange-500 font-semibold">Premium</span>
                </div>
            </div>
        </header>

        <div class="flex">
            <!-- Left Sidebar -->
            <aside class="w-64 bg-gray-800 min-h-screen p-4">
                <div class="space-y-4">
                    <div class="flex items-center space-x-3 p-3 bg-gray-700 rounded-lg">
                        <svg class="w-5 h-5 text-gray-300" fill="currentColor" viewBox="0 0 20 20">
                            <path d="M9 12l2 2 4-4m6 2a9 9 0 11-18 0 9 9 0 0118 0z"></path>
                        </svg>
                        <span class="text-white font-medium">Library</span>
                    </div>

                    <div class="flex items-center space-x-3 p-3 hover:bg-gray-700 rounded-lg cursor-pointer">
                        <svg class="w-5 h-5 text-gray-300" fill="currentColor" viewBox="0 0 20 20">
                            <path d="M9 12l2 2 4-4m6 2a9 9 0 11-18 0 9 9 0 0118 0z"></path>
                        </svg>
                        <span class="text-gray-300">Study Plan</span>
                    </div>

                    <div class="mt-6">
                        <div class="flex items-center justify-between mb-3">
                            <span class="text-gray-300 font-medium">My Lists</span>
                            <button class="text-gray-400 hover:text-white">
                                <svg class="w-4 h-4" fill="currentColor" viewBox="0 0 20 20">
                                    <path fill-rule="evenodd"
                                        d="M10 3a1 1 0 011 1v5h5a1 1 0 110 2h-5v5a1 1 0 11-2 0v-5H4a1 1 0 110-2h5V4a1 1 0 011-1z"
                                        clip-rule="evenodd" />
                                </svg>
                            </button>
                        </div>
                        <div class="flex items-center space-x-3 p-3 hover:bg-gray-700 rounded-lg cursor-pointer">
                            <svg class="w-5 h-5 text-orange-500" fill="currentColor" viewBox="0 0 20 20">
                                <path
                                    d="M9.049 2.927c.3-.921 1.603-.921 1.902 0l1.07 3.292a1 1 0 00.95.69h3.462c.969 0 1.371 1.24.588 1.81l-2.8 2.034a1 1 0 00-.364 1.118l1.07 3.292c.3.921-.755 1.688-1.54 1.118l-2.8-2.034a1 1 0 00-1.175 0l-2.8 2.034c-.784.57-1.838-.197-1.539-1.118l1.07-3.292a1 1 0 00-.364-1.118L2.98 8.72c-.783-.57-.38-1.81.588-1.81h3.461a1 1 0 00.951-.69l1.07-3.292z" />
                            </svg>
                            <span class="text-gray-300">Favorite</span>
                            <svg class="w-4 h-4 text-gray-400 ml-auto" fill="currentColor" viewBox="0 0 20 20">
                                <path fill-rule="evenodd"
                                    d="M5 9V7a5 5 0 0110 0v2a2 2 0 012 2v5a2 2 0 01-2 2H5a2 2 0 01-2-2v-5a2 2 0 012-2zm8-2v2H7V7a3 3 0 016 0z"
                                    clip-rule="evenodd" />
                            </svg>
                        </div>
                    </div>
                </div>
            </aside>

            <!-- Main Content -->
            <main class="flex-1 p-6">
                <!-- Feature Cards -->
                <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-4 mb-8">
                    <div class="bg-gradient-to-br from-green-600 to-green-700 rounded-lg p-6 text-white">
                        <h3 class="text-lg font-semibold mb-2">LeetCode's Interview Crash Course</h3>
                        <p class="text-sm opacity-90 mb-4">System Design for Interviews and Beyond</p>
                        <button class="bg-white text-green-700 px-4 py-2 rounded font-medium text-sm">Start
                            Learning</button>
                    </div>

                    <div class="bg-gradient-to-br from-purple-600 to-purple-700 rounded-lg p-6 text-white">
                        <h3 class="text-lg font-semibold mb-2">LeetCode's Interview Crash Course</h3>
                        <p class="text-sm opacity-90 mb-4">Data Structures and Algorithms</p>
                        <button class="bg-white text-purple-700 px-4 py-2 rounded font-medium text-sm">Start
                            Learning</button>
                    </div>

                    <div class="bg-gradient-to-br from-orange-500 to-orange-600 rounded-lg p-6 text-white">
                        <h3 class="text-lg font-semibold mb-2">New & Trending Company Qs</h3>
                        <p class="text-sm opacity-90 mb-4">Latest Qs from Big Tech</p>
                        <button class="bg-white text-orange-600 px-4 py-2 rounded font-medium text-sm">Claim
                            Now</button>
                    </div>

                    <div class="bg-gradient-to-br from-blue-500 to-blue-600 rounded-lg p-6 text-white">
                        <h3 class="text-lg font-semibold mb-2">Top Interview Questions</h3>
                        <p class="text-sm opacity-90 mb-4">Get Started</p>
                        <button class="bg-white text-blue-600 px-4 py-2 rounded font-medium text-sm">Get
                            Started</button>
                    </div>
                </div>

                <!-- Topic Tags -->
                <div class="flex flex-wrap gap-3 mb-6">
                    <span v-for="topic in topics" :key="topic.name"
                        class="px-3 py-1 bg-gray-700 rounded-full text-sm cursor-pointer hover:bg-gray-600">
                        {{ topic.name }} <span class="text-gray-400">{{ topic.count }}</span>
                    </span>
                </div>

                <!-- Filter Buttons -->
                <div class="flex flex-wrap gap-3 mb-6">
                    <button v-for="filter in filters" :key="filter.name" :class="[
                        'px-4 py-2 rounded-full text-sm font-medium transition-colors',
                        filter.active
                            ? 'bg-gray-600 text-white'
                            : 'bg-gray-800 text-gray-300 hover:bg-gray-700'
                    ]">
                        <span v-if="filter.icon" class="mr-2">{{ filter.icon }}</span>
                        {{ filter.name }}
                    </button>
                </div>

                <!-- Search and Sort -->
                <div class="flex items-center justify-between mb-6">
                    <div class="flex items-center space-x-4">
                        <div class="relative">
                            <svg class="w-5 h-5 text-gray-400 absolute left-3 top-1/2 transform -translate-y-1/2"
                                fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                    d="M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0z"></path>
                            </svg>
                            <input type="text" placeholder="Search questions"
                                class="bg-gray-800 border border-gray-600 rounded-lg pl-10 pr-4 py-2 text-white placeholder-gray-400 focus:outline-none focus:border-blue-500">
                        </div>
                        <button class="text-gray-400 hover:text-white">
                            <svg class="w-5 h-5" fill="currentColor" viewBox="0 0 20 20">
                                <path fill-rule="evenodd"
                                    d="M3 3a1 1 0 011-1h12a1 1 0 011 1v3a1 1 0 01-.293.707L12 11.414V15a1 1 0 01-.293.707l-2 2A1 1 0 018 17v-5.586L3.293 6.707A1 1 0 013 6V3z"
                                    clip-rule="evenodd" />
                            </svg>
                        </button>
                    </div>
                    <div class="flex items-center space-x-2 text-sm text-gray-400">
                        <span class="w-3 h-3 bg-green-500 rounded-full"></span>
                        <span>203/3600 Solved</span>
                    </div>
                </div>

                <!-- Problems List -->
                <div class="bg-gray-800 rounded-lg overflow-hidden">
                    <div v-for="problem in problems" :key="problem.id"
                        class="flex items-center justify-between p-4 border-b border-gray-700 hover:bg-gray-750 cursor-pointer">
                        <div class="flex items-center space-x-4">
                            <div class="flex items-center space-x-2">
                                <svg v-if="problem.solved" class="w-5 h-5 text-green-500" fill="currentColor"
                                    viewBox="0 0 20 20">
                                    <path fill-rule="evenodd"
                                        d="M16.707 5.293a1 1 0 010 1.414l-8 8a1 1 0 01-1.414 0l-4-4a1 1 0 011.414-1.414L8 12.586l7.293-7.293a1 1 0 011.414 0z"
                                        clip-rule="evenodd" />
                                </svg>
                                <span class="text-blue-400">{{ problem.id }}.</span>
                            </div>
                            <span class="text-white">{{ problem.title }}</span>
                        </div>
                        <div class="flex items-center space-x-6">
                            <span class="text-gray-400">{{ problem.acceptance }}%</span>
                            <span :class="[
                                'px-2 py-1 rounded text-xs font-medium',
                                problem.difficulty === 'Easy' ? 'text-green-400' :
                                    problem.difficulty === 'Med.' ? 'text-yellow-400' : 'text-red-400'
                            ]">
                                {{ problem.difficulty }}
                            </span>
                            <div class="flex space-x-1">
                                <div v-for="i in 6" :key="i" class="w-1 h-4 bg-gray-600 rounded-sm"></div>
                            </div>
                        </div>
                    </div>
                </div>
            </main>

            <!-- Right Sidebar -->
            <aside class="w-80 p-6">
                <!-- Calendar Widget -->
                <div class="bg-gray-800 rounded-lg p-4 mb-6">
                    <div class="flex items-center justify-between mb-4">
                        <h3 class="text-white font-semibold">Day 1</h3>
                        <span class="text-orange-500 text-sm">5 questions</span>
                    </div>
                    <div class="grid grid-cols-7 gap-1 text-center text-sm">
                        <div v-for="day in ['M', 'T', 'W', 'T', 'F', 'S', 'S']" :key="day" class="text-gray-400 p-2">{{
                            day }}</div>
                        <div v-for="date in calendarDates" :key="date.day" :class="[
                            'p-2 rounded cursor-pointer',
                            date.active ? 'bg-green-500 text-white' : 'text-gray-300 hover:bg-gray-700'
                        ]">
                            {{ date.day }}
                        </div>
                    </div>
                    <div class="mt-4 text-center">
                        <span class="text-orange-500 text-sm">Weekly Premium</span>
                        <div class="text-xs text-gray-400 mt-1">5 days left</div>
                    </div>
                </div>

                <!-- Trending Companies -->
                <div class="bg-gray-800 rounded-lg p-4">
                    <div class="flex items-center justify-between mb-4">
                        <h3 class="text-white font-semibold">Trending Companies</h3>
                        <div class="flex space-x-2">
                            <button class="text-gray-400 hover:text-white">
                                <svg class="w-4 h-4" fill="currentColor" viewBox="0 0 20 20">
                                    <path fill-rule="evenodd"
                                        d="M12.707 5.293a1 1 0 010 1.414L9.414 10l3.293 3.293a1 1 0 01-1.414 1.414l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 0z"
                                        clip-rule="evenodd" />
                                </svg>
                            </button>
                            <button class="text-gray-400 hover:text-white">
                                <svg class="w-4 h-4" fill="currentColor" viewBox="0 0 20 20">
                                    <path fill-rule="evenodd"
                                        d="M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z"
                                        clip-rule="evenodd" />
                                </svg>
                            </button>
                        </div>
                    </div>
                    <div class="space-y-3">
                        <div v-for="company in companies" :key="company.name"
                            class="flex items-center justify-between p-2 hover:bg-gray-700 rounded cursor-pointer">
                            <span class="text-white">{{ company.name }}</span>
                            <span :class="[
                                'px-2 py-1 rounded text-xs',
                                company.color
                            ]">
                                {{ company.count }}
                            </span>
                        </div>
                    </div>
                </div>
            </aside>
        </div>
    </div>
</template>

<script setup>
import { ref } from 'vue'

const topics = ref([
    { name: 'Array', count: '1948' },
    { name: 'String', count: '801' },
    { name: 'Hash Table', count: '710' },
    { name: 'Dynamic Programming', count: '601' },
    { name: 'Math', count: '592' },
    { name: 'Sorting', count: '457' },
    { name: 'Greedy', count: '422' },
    { name: 'Depth-First Search', count: 'Expand' }
])

const filters = ref([
    { name: 'All Topics', active: true, icon: '📋' },
    { name: 'Algorithms', active: false, icon: '🧮' },
    { name: 'Database', active: false, icon: '🗄️' },
    { name: 'Shell', active: false, icon: '$' },
    { name: 'Concurrency', active: false, icon: '⚡' },
    { name: 'JavaScript', active: false, icon: '📊' },
    { name: 'Pandas', active: false, icon: '🐼' }
])

const problems = ref([
    { id: '3330', title: 'Find the Original Typed String I', acceptance: '69.4', difficulty: 'Easy', solved: false },
    { id: '1', title: 'Two Sum', acceptance: '55.8', difficulty: 'Easy', solved: true },
    { id: '2', title: 'Add Two Numbers', acceptance: '46.3', difficulty: 'Med.', solved: true },
    { id: '3', title: 'Longest Substring Without Repeating Characters', acceptance: '37.0', difficulty: 'Med.', solved: true },
    { id: '4', title: 'Median of Two Sorted Arrays', acceptance: '43.9', difficulty: 'Hard', solved: true },
    { id: '5', title: 'Longest Palindromic Substring', acceptance: '35.9', difficulty: 'Med.', solved: true }
])

const calendarDates = ref([
    { day: 1, active: true },
    { day: 2, active: false },
    { day: 3, active: false },
    { day: 4, active: false },
    { day: 5, active: false },
    { day: 6, active: false },
    { day: 7, active: false },
    { day: 8, active: false },
    { day: 9, active: false },
    { day: 10, active: false },
    { day: 11, active: false },
    { day: 12, active: false },
    { day: 13, active: false },
    { day: 14, active: false },
    { day: 15, active: false },
    { day: 16, active: false },
    { day: 17, active: false },
    { day: 18, active: false },
    { day: 19, active: false },
    { day: 20, active: false },
    { day: 21, active: false },
    { day: 22, active: false },
    { day: 23, active: false },
    { day: 24, active: false },
    { day: 25, active: false },
    { day: 26, active: false },
    { day: 27, active: false },
    { day: 28, active: false },
    { day: 29, active: false },
    { day: 30, active: false },
    { day: 31, active: false }
])

const companies = ref([
    { name: 'Amazon', count: '1856', color: 'bg-orange-500 text-white' },
    { name: 'Uber', count: '538', color: 'bg-gray-600 text-white' },
    { name: 'Meta', count: '1229', color: 'bg-blue-500 text-white' },
    { name: 'Google', count: '2030', color: 'bg-red-500 text-white' },
    { name: 'Apple', count: '598', color: 'bg-gray-700 text-white' },
    { name: 'Bloomberg', count: '1053', color: 'bg-yellow-600 text-white' }
])
</script>

<style scoped>
.bg-gray-750 {
    background-color: #374151;
}
</style>