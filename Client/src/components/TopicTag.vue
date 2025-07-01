<template>
    <span class="bg-gray-800 hover:bg-gray-700 px-3 py-1 rounded-full text-sm cursor-pointer border border-gray-700">
        {{ topic.name }} <span class="text-gray-400">{{ topic.count }}</span>
    </span>
</template>

<script setup>
defineProps(['topic'])
</script>

<style scoped></style>