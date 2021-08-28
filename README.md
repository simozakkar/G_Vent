# G_Vent
## Step 1 Create DB
Create databases (VendB and G_STOCK) using DUMPS files in the link below https://drive.google.com/drive/folders/1XHIfehBHv-VEC9Fva_8M4bnEhofnuuO0?usp=sharing

## Step 2 Hibernate Configuration
Change the Hibernate configuration of both databases, enter your user and your password.

in **G_Vent/src/main/resources/hibernate.cfg.xml** and in **G_Vent/src/main/resources/hibernateStock.cfg.xml**
```
  <property name="hibernate.connection.username">your_user</property>
  
  <property name="hibernate.connection.password">your_password</property>
  ```
## Step 3 Run the server 
Configure the Tomcat server on the project, start the server

**For more details, try watching the video in the link below** 
[Video Link](https://drive.google.com/file/d/1Hf20oK--rmuCD4l9nUS1kk-z_VMCWQnV/view?usp=sharing).
