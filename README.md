# Car Rental System Assignment

## Task Breakdown:

### Customer Role:

#### Customer Class (Student 1):
- **Attributes**: `customerID`, `rentalHistory`
- **Methods**: `bookCar()`, `cancelBooking()`

#### Payment Class (Student 2):
- **Attributes**: `amount`, `paymentDate`
- **Methods**: `processPayment()`, `generateInvoice()`

---

### Staff Role:

#### Maintenance Staff Class (Student 3):
- **Attributes**: `staffID`, `expertise`
- **Methods**: `scheduleMaintenance()`, `recordMaintenance()`

#### Car Class (Student 4):
- **Attributes**: `carID`, `make`, `model`, `availability`
- **Methods**: `checkAvailability()`, `updateStatus()`

---

### Manager Role:

#### Manager Class (Student 5):
- **Attributes**: `managerID`, `assignedCars`
- **Methods**: `manageFinances()`, `assignCar()`

#### Report Class (Student 6):
- **Attributes**: `reportID`, `reportType`
- **Methods**: `generateDailyReport()`, `generateMonthlyReport()`

---

### Driver Role:

#### Driver Class (Student 7):
- **Attributes**: `driverID`, `licenseNo`, `assignedRides`
- **Methods**: `scheduleRide()`, `logRide()`

#### Schedule Class (Student 8):
- **Attributes**: `scheduleID`, `date`, `time`
- **Methods**: `createSchedule()`, `updateSchedule()`

---

### Admin Role:

#### Admin Class (Student 9):
- **Attributes**: `adminID`
- **Methods**: `createAccount()`, `assignRole()`

#### User Class (Student 10):
- **Attributes**: `userID`, `password`
- **Methods**: `login()`, `logout()`

---

### Additional Classes:

#### Insurance Class (Student 11):
- **Attributes**: `insuranceID`, `provider`, `coverage`
- **Methods**: `addInsurance()`, `viewInsuranceDetails()`

#### Transaction Class (Student 12):
- **Attributes**: `transactionID`, `type`, `amount`
- **Methods**: `recordTransaction()`, `viewTransactionHistory()`
