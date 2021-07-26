<%@ taglib prefix="s" uri="/struts-tags" %>
<s:iterator var="article" value="articles" >
    <!-- current iteration value (1, ... 5) -->
    <div class="col-12 col-md-6 col-lg-4">
        <div class="clean-product-item">
            <div class="image"><a href="#" ><img class="img-fluid d-block mx-auto" src="assets/img/produits/MEN_<s:property value="#article.codeArt"/>.jpg"></a></div>
            <div class="product-name"><a href="#">Lorem ipsum dolor sit amet</a></div>
            <div class="about">
                <div class="rating"><img src="assets/img/icons/star.svg"><img src="assets/img/icons/star.svg"><img src="assets/img/icons/star.svg"><img src="assets/img/icons/star-half-empty.svg"><img src="assets/img/icons/star-empty.svg"></div>
                <div class="price">
                    <h3>$100</h3>
                </div>
            </div>
        </div>
    </div>
</s:iterator>