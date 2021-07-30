<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 7/28/21
  Time: 4:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Settings Ray-Ban</title>
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
                    <li class="nav-item"><span class="nav-link">Welecome <s:property value="#session.user.name" /></span></li>
                    <li class="nav-item"><a class="nav-link" href="logout.action"><img src="assets/img/icons/logout.svg"></a></li>
                    <li class="nav-item"><a class="nav-link" href="settings.action"><img src="assets/img/icons/settings.svg"></a></li>
                </ul>
            </div>
        </div>
    </nav>
    <main class="page login-page">
        <section class="clean-block clean-form dark">
            <div class="container">
                <div class="accordion" id="accordionExample">
                    <div class="card">
                        <div class="card-header" id="headingOne">
                            <h2 class="mb-0">
                                <button class="btn btn-link btn-block text-left" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                                    Change Password
                                </button>
                            </h2>
                        </div>

                        <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordionExample">
                            <div class="card-body">
                                <form >
                                    <div class="form-group">
                                        <label for="newPassword">New Password</label>
                                        <input class="form-control" type="password" name="newPassword" id="newPassword">
                                    </div>
                                    <div class="form-group">
                                        <label id="old" for="oldPassword">Old Password</label>
                                        <input class="form-control item" type="Password" name="oldPassword" id="oldPassword">
                                    </div>
                                    <div id="statu"></div>
                                    <button class="btn btn-primary btn-block" type="submit" id="changePsw">Change the password</button>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="card">
                        <div class="card-header" id="headingTwo">
                            <h2 class="mb-0">
                                <button class="btn btn-link btn-block text-left collapsed" type="button" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                    Change Name
                                </button>
                            </h2>
                        </div>
                        <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
                            <div class="card-body">
                                <form >
                                    <div class="form-group">
                                        <label for="newName">New Name</label>
                                        <input class="form-control item" type="Password" name="newName" id="newName">
                                    </div>
                                    <div class="form-group">
                                        <label for="password">Password</label>
                                        <input class="form-control" type="password" name="password" id="password">
                                    </div>
                                    <div id="statu_"></div>
                                    <button id="changeName" class="btn btn-primary btn-block" type="submit">Change the name</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </main>
    <footer class="page-footer dark">
        <div class="footer-copyright">
            <p>© 2021 UAE FS TETOUAN</p>
        </div>
    </footer>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.js"></script>
    <script>
        $('#changePsw').on('click', function (e){
            e.preventDefault();
            $('#changePsw').hide()
            let newPassword = $('#newPassword').val();
            let oldPassword = $('#oldPassword').val();
            $.ajax({
                type: "POST",
                url: "/changePswOrName.action",
                data:{
                    newPassword: newPassword,
                    oldPassword: oldPassword
                },
                success: function(data){
                    $('#changePsw').show()
                    $("#statu").html("<span class='text-success'>Your password has been successfully changed</span>");
                },
                error: function(error){
                    $('#changePsw').show()
                    $("#statu").html("<span class='text-danger'>Some problem occurred. Please try again</span>");
                }
            });
        })
        $('#changeName').on('click', function (e){
            e.preventDefault();
            $('#changeName').hide()
            let password = $('#password').val();
            let name = $('#newName').val();
            $.ajax({
                type: "POST",
                url: "/changePswOrName.action",
                data:{
                    newName: name,
                    oldPassword: password
                },
                success: function(data){
                    $('#changeName').show()
                    $("#statu_").html("<span class='text-success'>Your password has been successfully changed</span>");
                },
                error: function(error){
                    $('#changeName').show()
                    $("#statu_").html("<span class='text-danger'>Some problem occurred. Please try again</span>");
                }
            });
        })
    </script>
</body>
</html>
