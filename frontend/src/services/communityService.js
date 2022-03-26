import axios from "axios";

export default class CommunityService{
    getCommunites(){
        return axios.get("http://localhost:8080/api/communities/findall")
    }
    getCommunity(id){
        return axios.get("http://localhost:8080/api/communities/findbyid/"+id)
    }
    add(community){
        return axios.post("http://localhost:8080/api/communities/add",community)
    }
}