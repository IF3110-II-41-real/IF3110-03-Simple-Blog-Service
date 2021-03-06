
package org.chamerling.heroku.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.chamerling.heroku.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SayHiResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "sayHiResponse");
    private final static QName _Search_QNAME = new QName("http://service.heroku.chamerling.org/", "search");
    private final static QName _GetPostResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "getPostResponse");
    private final static QName _AddComment_QNAME = new QName("http://service.heroku.chamerling.org/", "addComment");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "deleteUserResponse");
    private final static QName _ListUnpublishedPostResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "listUnpublishedPostResponse");
    private final static QName _EditUserResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "editUserResponse");
    private final static QName _PublishPostResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "publishPostResponse");
    private final static QName _EditPost_QNAME = new QName("http://service.heroku.chamerling.org/", "editPost");
    private final static QName _SayHi_QNAME = new QName("http://service.heroku.chamerling.org/", "sayHi");
    private final static QName _AddPost_QNAME = new QName("http://service.heroku.chamerling.org/", "addPost");
    private final static QName _ListPublishedPost_QNAME = new QName("http://service.heroku.chamerling.org/", "listPublishedPost");
    private final static QName _AddUserResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "addUserResponse");
    private final static QName _ListComment_QNAME = new QName("http://service.heroku.chamerling.org/", "listComment");
    private final static QName _ListUser_QNAME = new QName("http://service.heroku.chamerling.org/", "listUser");
    private final static QName _PublishPost_QNAME = new QName("http://service.heroku.chamerling.org/", "publishPost");
    private final static QName _DeletePostResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "deletePostResponse");
    private final static QName _ListPublishedPostResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "listPublishedPostResponse");
    private final static QName _AddUser_QNAME = new QName("http://service.heroku.chamerling.org/", "addUser");
    private final static QName _GetData_QNAME = new QName("http://service.heroku.chamerling.org/", "getData");
    private final static QName _EditPostResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "editPostResponse");
    private final static QName _AddCommentResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "addCommentResponse");
    private final static QName _GetDataResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "getDataResponse");
    private final static QName _DeleteUser_QNAME = new QName("http://service.heroku.chamerling.org/", "deleteUser");
    private final static QName _SearchResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "searchResponse");
    private final static QName _ListUserResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "listUserResponse");
    private final static QName _AddPostResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "addPostResponse");
    private final static QName _EditUser_QNAME = new QName("http://service.heroku.chamerling.org/", "editUser");
    private final static QName _ListUnpublishedPost_QNAME = new QName("http://service.heroku.chamerling.org/", "listUnpublishedPost");
    private final static QName _GetPost_QNAME = new QName("http://service.heroku.chamerling.org/", "getPost");
    private final static QName _DeletePost_QNAME = new QName("http://service.heroku.chamerling.org/", "deletePost");
    private final static QName _Tambah_QNAME = new QName("http://service.heroku.chamerling.org/", "tambah");
    private final static QName _TambahResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "tambahResponse");
    private final static QName _ListCommentResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "listCommentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.chamerling.heroku.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListUser }
     * 
     */
    public ListUser createListUser() {
        return new ListUser();
    }

    /**
     * Create an instance of {@link ListComment }
     * 
     */
    public ListComment createListComment() {
        return new ListComment();
    }

    /**
     * Create an instance of {@link PublishPost }
     * 
     */
    public PublishPost createPublishPost() {
        return new PublishPost();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link ListPublishedPost }
     * 
     */
    public ListPublishedPost createListPublishedPost() {
        return new ListPublishedPost();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link ListPublishedPostResponse }
     * 
     */
    public ListPublishedPostResponse createListPublishedPostResponse() {
        return new ListPublishedPostResponse();
    }

    /**
     * Create an instance of {@link DeletePostResponse }
     * 
     */
    public DeletePostResponse createDeletePostResponse() {
        return new DeletePostResponse();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link ListUnpublishedPostResponse }
     * 
     */
    public ListUnpublishedPostResponse createListUnpublishedPostResponse() {
        return new ListUnpublishedPostResponse();
    }

    /**
     * Create an instance of {@link EditUserResponse }
     * 
     */
    public EditUserResponse createEditUserResponse() {
        return new EditUserResponse();
    }

    /**
     * Create an instance of {@link PublishPostResponse }
     * 
     */
    public PublishPostResponse createPublishPostResponse() {
        return new PublishPostResponse();
    }

    /**
     * Create an instance of {@link SayHiResponse }
     * 
     */
    public SayHiResponse createSayHiResponse() {
        return new SayHiResponse();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link GetPostResponse }
     * 
     */
    public GetPostResponse createGetPostResponse() {
        return new GetPostResponse();
    }

    /**
     * Create an instance of {@link AddComment }
     * 
     */
    public AddComment createAddComment() {
        return new AddComment();
    }

    /**
     * Create an instance of {@link EditPost }
     * 
     */
    public EditPost createEditPost() {
        return new EditPost();
    }

    /**
     * Create an instance of {@link SayHi }
     * 
     */
    public SayHi createSayHi() {
        return new SayHi();
    }

    /**
     * Create an instance of {@link AddPost }
     * 
     */
    public AddPost createAddPost() {
        return new AddPost();
    }

    /**
     * Create an instance of {@link AddPostResponse }
     * 
     */
    public AddPostResponse createAddPostResponse() {
        return new AddPostResponse();
    }

    /**
     * Create an instance of {@link EditUser }
     * 
     */
    public EditUser createEditUser() {
        return new EditUser();
    }

    /**
     * Create an instance of {@link ListUnpublishedPost }
     * 
     */
    public ListUnpublishedPost createListUnpublishedPost() {
        return new ListUnpublishedPost();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link ListUserResponse }
     * 
     */
    public ListUserResponse createListUserResponse() {
        return new ListUserResponse();
    }

    /**
     * Create an instance of {@link Tambah }
     * 
     */
    public Tambah createTambah() {
        return new Tambah();
    }

    /**
     * Create an instance of {@link DeletePost }
     * 
     */
    public DeletePost createDeletePost() {
        return new DeletePost();
    }

    /**
     * Create an instance of {@link TambahResponse }
     * 
     */
    public TambahResponse createTambahResponse() {
        return new TambahResponse();
    }

    /**
     * Create an instance of {@link ListCommentResponse }
     * 
     */
    public ListCommentResponse createListCommentResponse() {
        return new ListCommentResponse();
    }

    /**
     * Create an instance of {@link GetPost }
     * 
     */
    public GetPost createGetPost() {
        return new GetPost();
    }

    /**
     * Create an instance of {@link EditPostResponse }
     * 
     */
    public EditPostResponse createEditPostResponse() {
        return new EditPostResponse();
    }

    /**
     * Create an instance of {@link GetData }
     * 
     */
    public GetData createGetData() {
        return new GetData();
    }

    /**
     * Create an instance of {@link AddCommentResponse }
     * 
     */
    public AddCommentResponse createAddCommentResponse() {
        return new AddCommentResponse();
    }

    /**
     * Create an instance of {@link GetDataResponse }
     * 
     */
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link ArrayList }
     * 
     */
    public ArrayList createArrayList() {
        return new ArrayList();
    }

    /**
     * Create an instance of {@link Post }
     * 
     */
    public Post createPost() {
        return new Post();
    }

    /**
     * Create an instance of {@link Comment }
     * 
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "sayHiResponse")
    public JAXBElement<SayHiResponse> createSayHiResponse(SayHiResponse value) {
        return new JAXBElement<SayHiResponse>(_SayHiResponse_QNAME, SayHiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Search }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "search")
    public JAXBElement<Search> createSearch(Search value) {
        return new JAXBElement<Search>(_Search_QNAME, Search.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "getPostResponse")
    public JAXBElement<GetPostResponse> createGetPostResponse(GetPostResponse value) {
        return new JAXBElement<GetPostResponse>(_GetPostResponse_QNAME, GetPostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddComment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "addComment")
    public JAXBElement<AddComment> createAddComment(AddComment value) {
        return new JAXBElement<AddComment>(_AddComment_QNAME, AddComment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUnpublishedPostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "listUnpublishedPostResponse")
    public JAXBElement<ListUnpublishedPostResponse> createListUnpublishedPostResponse(ListUnpublishedPostResponse value) {
        return new JAXBElement<ListUnpublishedPostResponse>(_ListUnpublishedPostResponse_QNAME, ListUnpublishedPostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "editUserResponse")
    public JAXBElement<EditUserResponse> createEditUserResponse(EditUserResponse value) {
        return new JAXBElement<EditUserResponse>(_EditUserResponse_QNAME, EditUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishPostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "publishPostResponse")
    public JAXBElement<PublishPostResponse> createPublishPostResponse(PublishPostResponse value) {
        return new JAXBElement<PublishPostResponse>(_PublishPostResponse_QNAME, PublishPostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditPost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "editPost")
    public JAXBElement<EditPost> createEditPost(EditPost value) {
        return new JAXBElement<EditPost>(_EditPost_QNAME, EditPost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "sayHi")
    public JAXBElement<SayHi> createSayHi(SayHi value) {
        return new JAXBElement<SayHi>(_SayHi_QNAME, SayHi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "addPost")
    public JAXBElement<AddPost> createAddPost(AddPost value) {
        return new JAXBElement<AddPost>(_AddPost_QNAME, AddPost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPublishedPost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "listPublishedPost")
    public JAXBElement<ListPublishedPost> createListPublishedPost(ListPublishedPost value) {
        return new JAXBElement<ListPublishedPost>(_ListPublishedPost_QNAME, ListPublishedPost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListComment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "listComment")
    public JAXBElement<ListComment> createListComment(ListComment value) {
        return new JAXBElement<ListComment>(_ListComment_QNAME, ListComment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "listUser")
    public JAXBElement<ListUser> createListUser(ListUser value) {
        return new JAXBElement<ListUser>(_ListUser_QNAME, ListUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishPost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "publishPost")
    public JAXBElement<PublishPost> createPublishPost(PublishPost value) {
        return new JAXBElement<PublishPost>(_PublishPost_QNAME, PublishPost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "deletePostResponse")
    public JAXBElement<DeletePostResponse> createDeletePostResponse(DeletePostResponse value) {
        return new JAXBElement<DeletePostResponse>(_DeletePostResponse_QNAME, DeletePostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPublishedPostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "listPublishedPostResponse")
    public JAXBElement<ListPublishedPostResponse> createListPublishedPostResponse(ListPublishedPostResponse value) {
        return new JAXBElement<ListPublishedPostResponse>(_ListPublishedPostResponse_QNAME, ListPublishedPostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "getData")
    public JAXBElement<GetData> createGetData(GetData value) {
        return new JAXBElement<GetData>(_GetData_QNAME, GetData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditPostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "editPostResponse")
    public JAXBElement<EditPostResponse> createEditPostResponse(EditPostResponse value) {
        return new JAXBElement<EditPostResponse>(_EditPostResponse_QNAME, EditPostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCommentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "addCommentResponse")
    public JAXBElement<AddCommentResponse> createAddCommentResponse(AddCommentResponse value) {
        return new JAXBElement<AddCommentResponse>(_AddCommentResponse_QNAME, AddCommentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "getDataResponse")
    public JAXBElement<GetDataResponse> createGetDataResponse(GetDataResponse value) {
        return new JAXBElement<GetDataResponse>(_GetDataResponse_QNAME, GetDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "searchResponse")
    public JAXBElement<SearchResponse> createSearchResponse(SearchResponse value) {
        return new JAXBElement<SearchResponse>(_SearchResponse_QNAME, SearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "listUserResponse")
    public JAXBElement<ListUserResponse> createListUserResponse(ListUserResponse value) {
        return new JAXBElement<ListUserResponse>(_ListUserResponse_QNAME, ListUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "addPostResponse")
    public JAXBElement<AddPostResponse> createAddPostResponse(AddPostResponse value) {
        return new JAXBElement<AddPostResponse>(_AddPostResponse_QNAME, AddPostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "editUser")
    public JAXBElement<EditUser> createEditUser(EditUser value) {
        return new JAXBElement<EditUser>(_EditUser_QNAME, EditUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUnpublishedPost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "listUnpublishedPost")
    public JAXBElement<ListUnpublishedPost> createListUnpublishedPost(ListUnpublishedPost value) {
        return new JAXBElement<ListUnpublishedPost>(_ListUnpublishedPost_QNAME, ListUnpublishedPost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "getPost")
    public JAXBElement<GetPost> createGetPost(GetPost value) {
        return new JAXBElement<GetPost>(_GetPost_QNAME, GetPost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "deletePost")
    public JAXBElement<DeletePost> createDeletePost(DeletePost value) {
        return new JAXBElement<DeletePost>(_DeletePost_QNAME, DeletePost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tambah }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "tambah")
    public JAXBElement<Tambah> createTambah(Tambah value) {
        return new JAXBElement<Tambah>(_Tambah_QNAME, Tambah.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TambahResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "tambahResponse")
    public JAXBElement<TambahResponse> createTambahResponse(TambahResponse value) {
        return new JAXBElement<TambahResponse>(_TambahResponse_QNAME, TambahResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCommentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "listCommentResponse")
    public JAXBElement<ListCommentResponse> createListCommentResponse(ListCommentResponse value) {
        return new JAXBElement<ListCommentResponse>(_ListCommentResponse_QNAME, ListCommentResponse.class, null, value);
    }

}
