<template>
    <div :class="bgColor" class="rounded-lg p-6 text-white relative overflow-hidden">
        <div v-if="badge" class="absolute top-2 right-2 bg-red-500 text-white text-xs px-2 py-1 rounded">
            {{ badge }}
        </div>
        <h3 class="font-bold text-lg mb-2">{{ title }}</h3>
        <p class="text-sm opacity-90 mb-4">{{ subtitle }}</p>
        <button
            class="bg-white bg-opacity-20 hover:bg-opacity-30 px-4 py-2 rounded-lg text-sm font-medium transition-all">
            {{ buttonText }}
        </button>
    </div>
</template>

<script setup>
defineProps(['title', 'subtitle', 'buttonText', 'bgColor', 'badge'])
</script>

<style scoped></style>