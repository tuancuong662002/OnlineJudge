<template>
    <div>
        <!-- <nav>
            <router-link to="/">Trang chủ</router-link> |
            <router-link to="/solve-problem">Giải bài</router-link> |
            <router-link to="/problems">Danh sách đề</router-link>
        </nav> -->

        <!-- 🔥 Đây là chỗ Vue hiển thị component ứng với route -->
        <router-view />
    </div>
</template>

<script setup>
// ❌ KHÔNG cần import bất kỳ view nào ở đây nữa
</script>

<style scoped>
nav {
    margin-bottom: 16px;
}
</style>
  
