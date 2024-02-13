import axios from "axios"

export const api = axios.create({
    baseURL: "http://localhost:8082"
})

/*Adds new room to the database */
export async function addRoom(photo, roomType, roomPrice){
    const formData = new formData()
    formData.append("photo", photo)
    formData.append("roomType", roomType)
    formData.append("roomPrice", roomPrice)

    const reponse = await api.post("/rooms/add/new-room", formData)
    if(reponse.status === 201){
        return true
    } else {
        return false
    }
}

/*Gets all types of rooms from the database */
export async function getRoomTypes(){
    try {
        const reponse = await api.get("/rooms/room-types")
        return reponse.data
    } catch (error) {
        throw new Error("Error fetching room-types")
    }
}