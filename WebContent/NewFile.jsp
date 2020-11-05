<jsp:include page="header.jsp"></jsp:include>


 <!-- Content Row -->

          <div class="row">

            <!-- Area Chart -- >
            <div class="col-xl-8 col-lg-7">
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">Liste Clients</h6>

                </div>
                <!-- Card Body -->
                <div class="card-body">
                Tableau
                 </div>
              </div>
            </div>

            <!-- Pie Chart -->
            <div class="col-xl-4 col-lg-5">
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">Ajout de Client</h6>
                
                </div>
                <!-- Card Body -->
                <div class="card-body">
                <pre>
                 <form action="" method="/Client">
  <label>nomFamille</label>
  <input type="text" name="nomFamille">
  <label>village</label>
  <input type="text" name="village">
  <label>adresse</label>
  <input type="text" name="adresse">
   <label>telephone</label>
  <input type="text" name="telephone">
  
   <input type="submit" name="Envoyer"/>
   <input type="reset" name="Annuler"/>
  
  </form>
   </pre>             
   
          </div> 
                   
<jsp:include page="footer.jsp"></jsp:include>