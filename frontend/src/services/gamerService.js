import axios from "axios";

export default class GamerService{
    getAll(){
        return axios.get("http://localhost:8080/api/gamers/findall")
    }
    getById(id){
        return axios.get("http://localhost:8080/api/gamers/findbyid/"+id)
    }
    add(gamer){
        return axios.post("http://localhost:8080/api/gamers/add",gamer)
    }
}