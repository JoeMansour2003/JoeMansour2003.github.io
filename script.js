var map = L.map("map").setView([45.35287, -75.65414], 17);

L.tileLayer("https://tile.openstreetmap.org/{z}/{x}/{y}.png", {
    attribution:
        '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors',
}).addTo(map);

L.marker([45.35287, -75.65414])
    .addTo(map)
    .bindPopup("Crown Dentistry")
    .openPopup();
