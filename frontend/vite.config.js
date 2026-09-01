import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

export default defineConfig({
  plugins: [vue()],
  build: {
    // Vite writes the built SPA straight into Spring Boot's static
    // resources, so it ships inside the jar and is served on :8080.
    outDir: '../src/main/resources/static',
    emptyOutDir: true
  },
  server: {
    // `npm run dev` serves the app on :5173 with HMR and forwards API
    // calls to the running Spring Boot backend.
    proxy: {
      '/api': 'http://localhost:8081'
    }
  }
})
