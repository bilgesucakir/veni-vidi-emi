<script setup>
import MapView from './components/MapView.vue'
</script>

<template>
  <div class="app">
    <header class="topbar">
      <span class="brand">veni vidi emi</span>
    </header>

    <div class="content">
      <MapView />
      <!-- TODO: sidebar listing the pins in view (web layout). -->
    </div>
  </div>
</template>

<style scoped>
.app {
  display: flex;
  flex-direction: column;
  height: 100%;
}

.topbar {
  flex: none;
  display: flex;
  align-items: center;
  padding: 0.6rem 1rem;
  border-bottom: 1px solid #e2e2e2;
}

.brand {
  font-weight: 600;
}

.content {
  position: relative;
  flex: 1;
}
</style>
