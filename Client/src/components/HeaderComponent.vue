<template>
    <header class="bg-gray-800 border-b border-gray-700 px-6 py-3">
        <div class="flex items-center justify-between">
            <div class="flex items-center space-x-8">
                <div class="flex items-center space-x-2">
                    <svg class="w-6 h-6 text-orange-500" fill="currentColor" viewBox="0 0 24 24">
                        <path
                            d="M13.483 0a1.374 1.374 0 0 0-.961.438L7.116 6.226l-3.854 4.126a5.266 5.266 0 0 0-1.209 2.104 5.35 5.35 0 0 0-.125.513 5.527 5.527 0 0 0 .062 2.362 5.83 5.83 0 0 0 .349 1.017 5.938 5.938 0 0 0 1.271 1.818l4.277 4.193.039.038c2.248 2.165 5.852 2.133 8.063-.074l2.396-2.392c.54-.54.54-1.414.003-1.955a1.378 1.378 0 0 0-1.951-.003l-2.396 2.392a3.021 3.021 0 0 1-4.205.038l-.02-.019-4.276-4.193c-.652-.64-.972-1.469-.948-2.263a2.68 2.68 0 0 1 .066-.523 2.545 2.545 0 0 1 .619-1.164L9.13 8.114c1.058-1.134 3.204-1.27 4.43-.278l3.501 2.831c.593.48 1.461.387 1.94-.207a1.384 1.384 0 0 0-.207-1.943l-3.5-2.831c-.8-.647-1.766-1.045-2.774-1.202l2.015-2.158A1.384 1.384 0 0 0 13.483 0z" />
                    </svg>
                    <span class="text-xl font-bold">LeetCode</span>
                </div>
                <nav class="flex space-x-6">
                    <a href="#" class="text-gray-300 hover:text-white">Explore</a>
                    <a href="#" class="text-white border-b-2 border-orange-500 pb-3">Problems</a>
                    <a href="#" class="text-gray-300 hover:text-white">Contest</a>
                    <a href="#" class="text-gray-300 hover:text-white">Discuss</a>
                    <a href="#" class="text-gray-300 hover:text-white flex items-center">
                        Interview
                        <svg class="w-4 h-4 ml-1" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M19 9l-7 7-7-7">
                            </path>
                        </svg>
                    </a>
                    <a href="#" class="text-orange-500 hover:text-orange-400 flex items-center">
                        Store
                        <svg class="w-4 h-4 ml-1" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M19 9l-7 7-7-7">
                            </path>
                        </svg>
                    </a>
                </nav>
            </div>
            <div class="flex items-center space-x-4">
                <button class="p-2 text-gray-400 hover:text-white">
                    <svg class="w-5 h-5" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M15 17h5l-5 5v-5z">
                        </path>
                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M9 7h6l-6-6v6z"></path>
                    </svg>
                </button>
                <div class="flex items-center space-x-2">
                    <span class="text-gray-400">0</span>
                    <div class="w-8 h-8 bg-gray-600 rounded-full"></div>
                </div>
                <span class="text-orange-500 font-medium">Premium</span>
            </div>
        </div>
    </header>
</template>

<script setup>
</script>

<style scoped></style>