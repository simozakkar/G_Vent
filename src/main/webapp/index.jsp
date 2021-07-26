<%@ taglib prefix="s" uri="/struts-tags" %>
<%--<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 7/19/21
  Time: 12:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Ray Ban</title>
<%--    <sj:head/>--%>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,400i,700,700i,600,600i">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/simple-line-icons/2.4.1/css/simple-line-icons.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.css">
    <link rel="stylesheet" href="assets/css/style.css">
</head>
<body>
    <nav class="navbar navbar-light navbar-expand-lg fixed-top bg-white clean-navbar">
        <div class="container">
            <a class="navbar-brand logo" href="index.action">
                <img src="assets/img/logo.png" style="width: 81px;height: 50px;">
            </a>
            <button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navcol-1">
                <ul class="navbar-nav ml-auto">
<%--                    <li class="nav-item"><a class="nav-link active" href="index.action">Home</a></li>--%>
                    <li class="nav-item">
                        <a class="nav-link" href="shopping.action">
                            <img src="assets/img/icons/shopping_cart.svg" style="opacity: 0.5">
                            Shopping Cart
                        </a>
                    </li>
                    <li class="nav-item"><a class="nav-link" href="login.action">Login</a></li>
                    <li class="nav-item"><a class="nav-link" href="register.action">Register</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <main class="page catalog-page">
        <section class="clean-block clean-catalog dark">
            <div class="container">
                <div class="content">
                    <div class="row">
                        <div class="col-md-3">
                            <div class="d-none d-md-block">
                                <div class="filters">
                                    <div class="filter-item">
                                        <h3>GENDER</h3>
                                        <div class="form-check"><input class="form-check-input" type="radio" id="allGender" name="genderRadio" checked><label class="form-check-label" for="allGender">All</label></div>
                                        <div class="form-check"><input class="form-check-input" type="radio" id="menGender" name="genderRadio"><label class="form-check-label" for="menGender">Men</label></div>
                                        <div class="form-check"><input class="form-check-input" type="radio" id="womenGender" name="genderRadio"><label class="form-check-label" for="womenGender">Women</label></div>
                                    </div>
                                    <div class="filter-item">
                                        <h3>PRODUCT CATEGORIES</h3>
                                        <div class="form-check"><input class="form-check-input" type="radio" id="allCateg"  name="categoriesRadio" checked><label class="form-check-label" for="allCateg">All</label></div>
                                        <div class="form-check"><input class="form-check-input" type="radio" id="eyeglassesCateg" name="categoriesRadio"><label class="form-check-label" for="eyeglassesCateg">EyeGlasses</label></div>
                                        <div class="form-check"><input class="form-check-input" type="radio" id="sunglassesCateg" name="categoriesRadio"><label class="form-check-label" for="sunglassesCateg">SunGlasses</label></div>
                                    </div>
                                    <div class="filter-item">
                                        <h3>SHAPE</h3>
                                        <div class="form-check"><input class="form-check-input" type="radio" id="formCheck-6"><label class="form-check-label" for="formCheck-6">Shape2</label></div>
                                        <div class="form-check"><input class="form-check-input" type="radio" id="formCheck-7"><label class="form-check-label" for="formCheck-7">Shape3</label></div>
                                    </div>
                                    <div class="filter-item">
                                        <h3>PRICE</h3>
                                        <div class="form-check"><input class="form-check-input" type="checkbox" id="formCheck-8"><label class="form-check-label" for="formCheck-8">ASC</label></div>
                                        <div class="form-check"><input class="form-check-input" type="checkbox" id="formCheck-9"><label class="form-check-label" for="formCheck-9">DESC</label></div>
                                    </div>
                                </div>
                            </div>
                            <div class="d-md-none"><a class="btn btn-link d-md-none filter-collapse" data-toggle="collapse" aria-expanded="false" aria-controls="filters" href="#filters" role="button">Filters<i class="icon-arrow-down filter-caret"></i></a>
                                <div class="collapse" id="filters">
                                    <div class="filters">
                                        <div class="filter-item">
                                            <h3>GENDER</h3>
                                            <div class="form-check"><input class="form-check-input" type="radio" id="allGender_" name="genderRadio_" checked><label class="form-check-label" for="allGender_">All</label></div>
                                            <div class="form-check"><input class="form-check-input" type="radio" id="menGender_" name="genderRadio_"><label class="form-check-label" for="menGender_">Men</label></div>
                                            <div class="form-check"><input class="form-check-input" type="radio" id="womenGender_" name="genderRadio_"><label class="form-check-label" for="womenGender_">Women</label></div>
                                        </div>
                                        <div class="filter-item">
                                            <h3>PRODUCT CATEGORIES</h3>
                                            <div class="form-check"><input class="form-check-input" type="radio" id="allCateg_"  name="categRadio_" checked><label class="form-check-label" for="allCateg_">All</label></div>
                                            <div class="form-check"><input class="form-check-input" type="radio" id="eyeglassesCateg_" name="categRadio_"><label class="form-check-label" for="eyeglassesCateg_">EyeGlasses</label></div>
                                            <div class="form-check"><input class="form-check-input" type="radio" id="sunglassesCateg_" name="categRadio_"><label class="form-check-label" for="sunglassesCateg_">SunGlasses</label></div>
                                        </div>
                                        <div class="filter-item">
                                            <h3>SHAPE</h3>
                                            <div class="form-check"><input class="form-check-input" type="checkbox" id="formCheck-5"><label class="form-check-label" for="formCheck-5">Shape1</label></div>
                                            <div class="form-check"><input class="form-check-input" type="checkbox" id="formCheck-6"><label class="form-check-label" for="formCheck-6">Shape2</label></div>
                                            <div class="form-check"><input class="form-check-input" type="checkbox" id="formCheck-7"><label class="form-check-label" for="formCheck-7">Shape3</label></div>
                                        </div>
                                        <div class="filter-item">
                                            <h3>PRICE</h3>
                                            <div class="form-check"><input class="form-check-input" type="checkbox" id="formCheck-8"><label class="form-check-label" for="formCheck-8">ASC</label></div>
                                            <div class="form-check"><input class="form-check-input" type="checkbox" id="formCheck-9"><label class="form-check-label" for="formCheck-9">DESC</label></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-9">
                            <div class="products">
                                <div id="products" class="row no-gutters">

                                </div>
                                <nav>
                                    <ul class="pagination">
                                        <li class="page-item disabled"><a class="page-link" href="#" aria-label="Previous"><span aria-hidden="true">«</span></a></li>
                                        <li class="page-item active"><a class="page-link" href="#">1</a></li>
                                        <li class="page-item"><a class="page-link" href="#">2</a></li>
                                        <li class="page-item"><a class="page-link" href="#">3</a></li>
                                        <li class="page-item"><a class="page-link" href="#" aria-label="Next"><span aria-hidden="true">»</span></a></li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <div id="inProgress">
            <div id="childInProgress" >
                <div class="spinner-grow text-primary" role="status"></div>
                <div class="spinner-grow text-secondary" role="status"></div>
                <div class="spinner-grow text-success" role="status"></div>
                <div class="spinner-grow text-danger" role="status"></div>
                <div class="spinner-grow text-warning" role="status"></div>
                <div class="spinner-grow text-info" role="status"></div>
            </div>
        </div>
    </main>

    <footer class="page-footer dark">
        <div class="container">
            <div class="row">
                <div class="col-sm-3">
                    <h5>Get started</h5>
                    <ul>
                        <li><a href="#">Home</a></li>
                        <li><a href="#">Sign up</a></li>
                        <li><a href="#">Downloads</a></li>
                    </ul>
                </div>
                <div class="col-sm-3">
                    <h5>About us</h5>
                    <ul>
                        <li><a href="#">Company Information</a></li>
                        <li><a href="#">Contact us</a></li>
                        <li><a href="#">Reviews</a></li>
                    </ul>
                </div>
                <div class="col-sm-3">
                    <h5>Support</h5>
                    <ul>
                        <li><a href="#">FAQ</a></li>
                        <li><a href="#">Help desk</a></li>
                        <li><a href="#">Forums</a></li>
                    </ul>
                </div>
                <div class="col-sm-3">
                    <h5>Legal</h5>
                    <ul>
                        <li><a href="#">Terms of Service</a></li>
                        <li><a href="#">Terms of Use</a></li>
                        <li><a href="#">Privacy Policy</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="footer-copyright">
            <p>© 2021 Copyright Text</p>
        </div>
    </footer>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.js"></script>

    <script>
        $.ajax({
            type: "POST",
            // I am using struts2+struts2-json-plugin-2.2.1.jar, these do not need to set
            //contentType: "text/html;charset=utf-8",
            //contentType: "application/json;charset=utf-8",
            url: "/products.action",
            data:{
                gender: "A"
            },
            success: function(data){
                $("#products").html(data);
                $('#inProgress').hide()
            }
        });

        $('input[type=radio][name=genderRadio]').change(function() {
            $('#inProgress').get(0).style.display = "flex";
            if (this.id == "allGender"){
                $('#allGender_').prop('checked', true);
                $.ajax({
                    type: "POST",
                    // I am using struts2+struts2-json-plugin-2.2.1.jar, these do not need to set
                    //contentType: "text/html;charset=utf-8",
                    //contentType: "application/json;charset=utf-8",
                    url: "/products.action",
                    data:{
                        gender: "A"
                    },
                    success: function(data){
                        $("#products").html(data);
                        $('#inProgress').hide()
                    }
                });
            }else if (this.id == "menGender"){
                $('#menGender_').prop('checked', true);
                $.ajax({
                    type: "POST",
                    // I am using struts2+struts2-json-plugin-2.2.1.jar, these do not need to set
                    //contentType: "text/html;charset=utf-8",
                    //contentType: "application/json;charset=utf-8",
                    url: "/products.action",
                    data:{
                        gender: "M"
                    },
                    success: function(data){
                        $("#products").html(data);
                        $('#inProgress').hide()
                    }
                });
            }else {
                $('#womenGender_').prop('checked', true);
                $.ajax({
                    type: "POST",
                    // I am using struts2+struts2-json-plugin-2.2.1.jar, these do not need to set
                    //contentType: "text/html;charset=utf-8",
                    //contentType: "application/json;charset=utf-8",
                    url: "/products.action",
                    data:{
                        gender: "W"
                    },
                    success: function(data){
                        $("#products").html(data);
                        $('#inProgress').hide()
                    }
                });
            }
        })

    </script>
</body>

</html>
