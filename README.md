
---

# 👨‍💼 Spring Boot REST API for Employee Management

---

## English

This is a simple Spring Boot REST API project designed to manage a list of employees stored in-memory using Java configuration. You can perform basic CRUD operations (Create, Read, Update, Delete) via REST endpoints.

## 🚀 Features

- In-memory employee list using `@Bean` configuration
- RESTful API using Spring Boot
- CRUD operations
- Search/filter support via query parameters
- Layered architecture: Controller -> Service -> Repository
- Uses Lombok for boilerplate code reduction

## 🛠️ Technologies Used

- Spring Web
- Spring Context
- Lombok
- Maven


## 📬 API Endpoints

| Method | Endpoint                         | Description                    |
|--------|----------------------------------|--------------------------------|
| GET    | `/rest/api/employee/list`        | Get all employees              |
| GET    | `/rest/api/employee/list/{ID}`   | Get employee by ID             |
| GET    | `/rest/api/employee/with-params` | Filter by first and/or last name |
| POST   | `/rest/api/employee/save-employee` | Add new employee             |
| PUT    | `/rest/api/employee/update-mapping/{ID}` | Update employee         |
| DELETE | `/rest/api/employee/delete-employee/{ID}` | Delete employee         |

### License

This project is licensed under the MIT License.

---

# 👨‍💼 Spring Boot REST API ile Çalışan Yönetimi

---

## Türkçe

Bu proje, Java ve Spring Boot kullanılarak geliştirilmiş, bellekte (`in-memory`) çalışan basit bir çalışan yönetim sistemidir. Çalışan bilgileri başlangıçta yüklü olarak gelir ve REST API aracılığıyla CRUD işlemleri yapılabilir.

## 🚀 Özellikler

- `@Bean` ile tanımlı çalışan listesi (in-memory)
- Spring Boot ile RESTful servisler
- CRUD işlemleri (Oluşturma, Okuma, Güncelleme, Silme)
- Query parametreleriyle filtreleme
- Katmanlı mimari: Controller → Service → Repository
- Lombok ile sadeleştirilmiş model sınıfı

## 🛠️ Kullanılan Teknolojiler

- Spring Web
- Spring Context
- Lombok
- Maven
 
## 📬 API Uç Noktaları

| Yöntem | Uç Nokta                                 | Açıklama                         |
|--------|------------------------------------------|----------------------------------|
| GET    | `/rest/api/employee/list`                | Tüm çalışanları getirir          |
| GET    | `/rest/api/employee/list/{ID}`           | ID'ye göre çalışan getirir       |
| GET    | `/rest/api/employee/with-params`         | Ad/soyad filtresi ile arama      |
| POST   | `/rest/api/employee/save-employee`       | Yeni çalışan ekler               |
| PUT    | `/rest/api/employee/update-mapping/{ID}` | Çalışan bilgilerini günceller    |
| DELETE | `/rest/api/employee/delete-employee/{ID}`| Çalışanı siler                   |

### Lisans

Bu proje MIT Lisansı ile lisanslanmıştır.

---
 