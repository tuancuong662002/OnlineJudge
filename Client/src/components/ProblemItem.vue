<template>
    <div class="flex items-center justify-between p-4 border-b border-gray-700 hover:bg-gray-750 cursor-pointer">
        <div class="flex items-center space-x-4">
            <div class="w-6 h-6 flex items-center justify-center">
                <svg v-if="problem.solved" class="w-4 h-4 text-green-500" fill="currentColor" viewBox="0 0 24 24">
                    <path d="M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41z" />
                </svg>
                <div v-else class="w-4 h-4 border border-gray-600 rounded"></div>
            </div>
            <div>
                <div class="flex items-center space-x-2">
                    <span class="text-blue-400">{{ problem.id }}.</span>
                    <span class="text-white">{{ problem.title }}</span>
                </div>
            </div>
        </div>
        <div class="flex items-center space-x-6">
            <span class="text-gray-400 text-sm">{{ problem.acceptance }}%</span>
            <span :class="getDifficultyColor(problem.difficulty)" class="text-sm font-medium">
                {{ problem.difficulty }}
            </span>
            <div class="flex space-x-1">
                <div v-for="i in 5" :key="i" class="w-1 h-4 bg-gray-600 rounded"></div>
            </div>
        </div>
    </div>
</template>

<script setup>
defineProps(['problem'])

const getDifficultyColor = (difficulty) => {
    switch (difficulty) {
        case 'Easy': return 'text-green-500'
        case 'Med.': return 'text-yellow-500'
        case 'Hard': return 'text-red-500'
        default: return 'text-gray-400'
    }
}
</script>

<style scoped>
.bg-gray-750 {
    background-color: #374151;
}
</style>