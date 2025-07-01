<template>
    <aside class="w-80 bg-gray-800 border-l border-gray-700 p-4">
        <div class="space-y-6">
            <!-- Calendar Widget -->
            <div class="bg-gray-900 rounded-lg p-4">
                <div class="flex items-center justify-between mb-4">
                    <h3 class="text-white font-medium">Day 26</h3>
                    <div class="flex space-x-2">
                        <button class="text-gray-400 hover:text-white">
                            <svg class="w-4 h-4" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                    d="M15 19l-7-7 7-7"></path>
                            </svg>
                        </button>
                        <button class="text-gray-400 hover:text-white">
                            <svg class="w-4 h-4" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M9 5l7 7-7 7">
                                </path>
                            </svg>
                        </button>
                    </div>
                </div>
                <div class="grid grid-cols-7 gap-1 text-xs">
                    <div class="text-center text-gray-400 p-1">S</div>
                    <div class="text-center text-gray-400 p-1">M</div>
                    <div class="text-center text-gray-400 p-1">T</div>
                    <div class="text-center text-gray-400 p-1">W</div>
                    <div class="text-center text-gray-400 p-1">T</div>
                    <div class="text-center text-gray-400 p-1">F</div>
                    <div class="text-center text-gray-400 p-1">S</div>
                    <div v-for="day in 35" :key="day" class="text-center p-1 hover:bg-gray-700 rounded cursor-pointer"
                        :class="day === 26 ? 'bg-green-600 text-white' : day === 2 || day === 9 || day === 16 || day === 23 ? 'text-green-400' : 'text-gray-300'">
                        {{ day <= 30 ? day : '' }} </div>
                    </div>
                    <div class="mt-4 text-center">
                        <div class="text-orange-500 font-medium">Weekly Premium</div>
                        <div class="text-gray-400 text-sm">2 days left</div>
                    </div>
                </div>

                <!-- Trending Companies -->
                <div class="bg-gray-900 rounded-lg p-4">
                    <div class="flex items-center justify-between mb-4">
                        <h3 class="text-white font-medium">Trending Companies</h3>
                        <div class="flex space-x-2">
                            <button class="text-gray-400 hover:text-white">
                                <svg class="w-4 h-4" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                    <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                        d="M15 19l-7-7 7-7"></path>
                                </svg>
                            </button>
                            <button class="text-gray-400 hover:text-white">
                                <svg class="w-4 h-4" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                    <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                        d="M9 5l7 7-7 7"></path>
                                </svg>
                            </button>
                        </div>
                    </div>
                    <div class="space-y-3">
                        <div class="flex items-center justify-between">
                            <span class="text-gray-300">Meta</span>
                            <span class="bg-orange-500 text-white text-xs px-2 py-1 rounded">1224</span>
                        </div>
                        <div class="flex items-center justify-between">
                            <span class="text-gray-300">Uber</span>
                            <span class="bg-orange-500 text-white text-xs px-2 py-1 rounded">538</span>
                        </div>
                        <div class="flex items-center justify-between">
                            <span class="text-gray-300">Google</span>
                            <span class="bg-orange-500 text-white text-xs px-2 py-1 rounded">2023</span>
                        </div>
                        <div class="flex items-center justify-between">
                            <span class="text-gray-300">Amazon</span>
                            <span class="bg-orange-500 text-white text-xs px-2 py-1 rounded">1853</span>
                        </div>
                        <div class="flex items-center justify-between">
                            <span class="text-gray-300">Apple</span>
                            <span class="bg-orange-500 text-white text-xs px-2 py-1 rounded">605</span>
                        </div>
                        <div class="flex items-center justify-between">
                            <span class="text-gray-300">Microsoft</span>
                            <span class="bg-orange-500 text-white text-xs px-2 py-1 rounded">1199</span>
                        </div>
                    </div>
                </div>
            </div>
    </aside>
</template>

<script setup>
</script>

<style scoped></style>