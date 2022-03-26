import axios from "axios";

export default class CommentService{
    getComments(){
        return axios.get("http://localhost:8080/api/comments/findall")
    }
    getComment(id){
        return axios.get("http://localhost:8080/api/comments/findbyid/"+id)
    }
    add(comment){
        return axios.post("http://localhost:8080/api/comments/add",comment)
    }
}