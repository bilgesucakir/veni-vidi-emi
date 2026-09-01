<script setup>
import { onMounted, onBeforeUnmount, ref, shallowRef } from 'vue'
import maplibregl from 'maplibre-gl'
import 'maplibre-gl/dist/maplibre-gl.css'

// OpenFreeMap: free vector tiles + styles, no API key, no usage limit.
// Swap for a self-hosted Protomaps PMTiles file later without touching logic.
const STYLE_URL = 'https://tiles.openfreemap.org/styles/liberty'

// Rough Istanbul center; will later come from the user's location / URL state.
const INITIAL_CENTER = [28.9784, 41.0082]
const INITIAL_ZOOM = 11

const mapContainer = ref(null)
const map = shallowRef(null)

onMounted(() => {
  map.value = new maplibregl.Map({
    container: mapContainer.value,
    style: STYLE_URL,
    center: INITIAL_CENTER,
    zoom: INITIAL_ZOOM,
    attributionControl: { compact: true },
  })

  map.value.addControl(new maplibregl.NavigationControl(), 'top-right')

  // TODO: on 'moveend', read map.getBounds() and fetch
  //       /api/listings?minLon=&minLat=&maxLon=&maxLat= , then render pins
  //       as a clustered GeoJSON source.
})

onBeforeUnmount(() => {
  map.value?.remove()
})
</script>

<template>
  <div ref="mapContainer" class="map" />
</template>

<style scoped>
.map {
  position: absolute;
  inset: 0;
}
</style>
