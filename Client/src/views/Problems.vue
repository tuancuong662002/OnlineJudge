<template>
    <div class="min-h-screen bg-gray-900 text-white">
        <!-- Header -->
        <HeaderComponent />

        <div class="flex">
            <!-- Left Sidebar -->
            <LeftSidebar />

            <!-- Main Content -->
            <main class="flex-1 p-6">
                <!-- Promotional Cards -->
                <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-4 mb-8">
                    <PromoCard title="LeetCode's Interview Crash Course"
                        subtitle="System Design for Interviews and Beyond" buttonText="Start Learning"
                        bgColor="bg-gradient-to-br from-green-600 to-green-700" />
                    <PromoCard title="LeetCode's Interview Crash Course" subtitle="Data Structures and Algorithms"
                        buttonText="Start Learning" bgColor="bg-gradient-to-br from-purple-600 to-blue-600" />
                    <PromoCard title="New & Trending Company Questions" subtitle="Latest Qs from Big Tech"
                        buttonText="Claim Now" bgColor="bg-gradient-to-br from-orange-500 to-yellow-500" badge="New" />
                    <PromoCard title="Top Interview Questions" subtitle="Get Started" buttonText="Get Started"
                        bgColor="bg-gradient-to-br from-blue-500 to-blue-600" />
                </div>

                <!-- Topic Tags -->
                <div class="flex flex-wrap gap-3 mb-6">
                    <TopicTag v-for="topic in topics" :key="topic.name" :topic="topic" />
                </div>

                <!-- Category Buttons -->
                <div class="flex flex-wrap gap-2 mb-6">
                    <CategoryButton v-for="category in categories" :key="category.name" :category="category"
                        :active="category.active" />
                </div>

                <!-- Search and Filters -->
                <div class="flex items-center justify-between mb-6">
                    <div class="flex items-center gap-4">
                        <div class="relative">
                            <input type="text" placeholder="Search questions"
                                class="bg-gray-800 border border-gray-700 rounded-lg px-4 py-2 pl-10 w-80 focus:outline-none focus:border-blue-500">
                            <svg class="w-4 h-4 absolute left-3 top-3 text-gray-400" fill="none" stroke="currentColor"
                                viewBox="0 0 24 24">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                    d="M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0z"></path>
                            </svg>
                        </div>
                        <button class="p-2 bg-gray-800 border border-gray-700 rounded-lg hover:bg-gray-700">
                            <svg class="w-4 h-4" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                    d="M3 4a1 1 0 011-1h16a1 1 0 011 1v2.586a1 1 0 01-.293.707l-6.414 6.414a1 1 0 00-.293.707v4.586l-4-2V9.414a1 1 0 00-.293-.707L3.293 6.707A1 1 0 013 6V4z">
                                </path>
                            </svg>
                        </button>
                        <button class="p-2 bg-gray-800 border border-gray-700 rounded-lg hover:bg-gray-700">
                            <svg class="w-4 h-4" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                    d="M7 16V4m0 0L3 8m4-4l4 4m6 0v12m0 0l4-4m-4 4l-4-4"></path>
                            </svg>
                        </button>
                    </div>
                    <div class="text-gray-400">203/3596 Solved</div>
                </div>

                <!-- Problems List -->
                <div class="bg-gray-800 rounded-lg overflow-hidden">
                    <ProblemItem v-for="problem in problems" :key="problem.id" :problem="problem" />
                </div>
            </main>

            <!-- Right Sidebar -->
            <RightSidebar />
        </div>
    </div>
</template>

<script setup>
import { ref } from 'vue'
import HeaderComponent from '../components/HeaderComponent.vue'
import LeftSidebar from '../components/LeftSidebar.vue'
import RightSidebar from '../components/RightSidebar.vue'
import PromoCard from '../components/PromoCard.vue'
import TopicTag from '../components/TopicTag.vue'
import CategoryButton from '../components/CategoryButton.vue'
import ProblemItem from '../components/ProblemItem.vue'

// Data
const topics = ref([
    { name: 'Array', count: '1944' },
    { name: 'String', count: '798' },
    { name: 'Hash Table', count: '709' },
    { name: 'Dynamic Programming', count: '600' },
    { name: 'Math', count: '591' },
    { name: 'Sorting', count: '457' },
    { name: 'Greedy', count: '421' },
    { name: 'Depth-First Search', count: 'Expand' }
])

const categories = ref([
    { name: 'All Topics', active: true, icon: 'div' },
    { name: 'Algorithms', active: false, icon: 'div' },
    { name: 'Database', active: false, icon: 'div' },
    { name: 'Shell', active: false, icon: 'div' },
    { name: 'Concurrency', active: false, icon: 'div' },
    { name: 'JavaScript', active: false, icon: 'div' }
])

const problems = ref([
    { id: 2311, title: 'Longest Binary Subsequence Less Than or Equal to K', acceptance: '50.8', difficulty: 'Med.', solved: false },
    { id: 1, title: 'Two Sum', acceptance: '55.8', difficulty: 'Easy', solved: true },
    { id: 2, title: 'Add Two Numbers', acceptance: '46.3', difficulty: 'Med.', solved: true },
    { id: 3, title: 'Longest Substring Without Repeating Characters', acceptance: '37.0', difficulty: 'Med.', solved: true },
    { id: 4, title: 'Median of Two Sorted Arrays', acceptance: '43.9', difficulty: 'Hard', solved: true },
    { id: 5, title: 'Longest Palindromic Substring', acceptance: '35.9', difficulty: 'Med.', solved: false }
])
</script>

<style scoped>
.bg-gray-750 {
    background-color: #374151;
}
</style>