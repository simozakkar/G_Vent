<%@ taglib prefix="s" uri="/struts-tags" %>
<s:iterator var="article" value="articles" >
    <div class="col-12 col-md-6 col-lg-4">
        <div class="clean-product-item">
            <div class="image">
                <s:url var="productPage" action="product">
                    <s:param name="idArt" value="#article.codeArt"/>
                </s:url>
                <s:a href="%{productPage}" >
                    <img class="img-fluid d-block mx-auto" src="assets/img/produits/<s:property value="#article.codeArt"/>.jpg">
                </s:a>
            </div>
            <div class="product-name">
                <a href=""><s:property value="#article.nomArt"/></a>
            </div>
            <div class="about">
                <div class="rating">
                    <s:iterator var="counter" begin="1" end="#article.stars" >
                        <img src="assets/img/icons/star.svg">
                    </s:iterator>
                    <s:iterator var="counter" begin="1" end="#article.starsHalfEmpty" >
                        <img src="assets/img/icons/star-half-empty.svg">
                    </s:iterator>
                    <s:iterator var="counter" begin="1" end="#article.starsEmpty" >
                        <img src="assets/img/icons/star-empty.svg">
                    </s:iterator>
                </div>
                <div class="price">
                    <h3>$<s:property value="#article.prixArt"/></h3>
                </div>
            </div>
        </div>
    </div>
</s:iterator>