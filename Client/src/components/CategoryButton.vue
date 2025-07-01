<template>
    <button :class="active ? 'bg-gray-700 text-white' : 'bg-gray-800 text-gray-300 hover:bg-gray-700'"
        class="px-4 py-2 rounded-lg text-sm font-medium transition-colors flex items-center space-x-2">
        <component :is="category.icon" class="w-4 h-4" />
        <span>{{ category.name }}</span>
    </button>
</template>

<script setup>
defineProps(['category', 'active'])
</script>

<style scoped></style>