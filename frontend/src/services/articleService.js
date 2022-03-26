import axios from "axios";

export default class ArticleService{
    getArticles(){
        return axios.get("http://localhost:8080/api/articles/findall")
    }
    getArtile(id){
        return axios.get("http://localhost:8080/api/articles/findbyid/"+id)
    }
    addArticle(article){
        return axios.post("http://localhost:8080/api/articles/add",article)
    }
}