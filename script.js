// Initialize and add the map
function initMap() {
    // Location coordinates
    const location = { lat: 40.712776, lng: -74.005974 };

    // Create a map centered at the specified location
    const map = new google.maps.Map(document.getElementById("map"), {
        zoom: 12,
        center: location,
    });

    // Add a marker at the specified location
    const marker = new google.maps.Marker({
        position: location,
        map: map,
    });
}
