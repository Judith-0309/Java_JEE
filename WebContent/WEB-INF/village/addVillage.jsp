
<jsp:include page="../../header.jsp"></jsp:include>
<!-- Content Row -->

<div class="row">

      <!-- Content Row -->

          <div class="row">
            <div class="col-xl-8 col-lg-5">
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">Liste des village</h6>
                  
                </div>
                <!-- Card Body -->
                <div class="card-body">
                 Tableau
                </div>
              </div>
            </div>

               <!-- Pie Chart -->
            <div class="col-xl-8 col-lg-5">
              <div class="card shadow mb-4">
                   <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">Ajout Village</h6>
                  </div>
                   <!-- Card Body -->
                <div class="card-body">
                  	<form action="/SenForage/Village" method="POST">
                  	
                  			<div class="form-group">
                  			   <label for="village">Village</label>
								<input name="village" type="text" class="form-control" />
							</div> 
							<div class="form-group">
							   <input class="btn btn-success" type="submit" name="Envoyer"/>
                            </div>
						</form>	         
				</div>
              </div>
            </div>
          </div>

<jsp:include page="../../footer.jsp"></jsp:include>
          