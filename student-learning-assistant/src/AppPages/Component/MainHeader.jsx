import {Nav, Navbar, NavbarBrand} from "react-bootstrap";

export const MainHeader = () => {
    return(<>
        <Navbar expand="sm" className={"main-header"}>
            <NavbarBrand>Learning Assistant</NavbarBrand>
            <Navbar.Toggle aria-controls="navbarScroll"/>
            <Navbar.Collapse id="navbarScroll" >
                <Nav navbarScroll className={"main-navbar"}>
                    <Nav.Link href={"/student-assistant/main"}>Home</Nav.Link>
                    <Nav.Link href={"/student-assistant/main"}> Create Course</Nav.Link>
                    <Nav.Link href={"/student-assistant/main"} >Learning Statistics</Nav.Link>
                </Nav>
            </Navbar.Collapse>
            <Nav.Link className={"mx-5"} href={"/student-assistant/main"} >User Profile</Nav.Link>
        </Navbar>
        </>);
}