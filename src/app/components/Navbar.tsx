'use client'

import { usePathname } from "next/navigation";
import Link from "next/link";

export default function Navbar() {

  const pathname = usePathname();

  return (
    <div className="navbar-div">
      <Link className="nav-title" href="/">nerds-geeks-dorks</Link>
      <br />
      <div className="nav">
        <Link className={`link ${pathname === '/' ? 'active' : ''}`} href="/">Home</Link>
        {/* <Link className={`link ${pathname === '/about' ? 'active' : ''}`} href="/about">About</Link> */}
        {/* <Link className={`link ${pathname === '/services' ? 'active' : ''}`} href="/services">Services</Link> */}
      </div>
    </div>
  );
}